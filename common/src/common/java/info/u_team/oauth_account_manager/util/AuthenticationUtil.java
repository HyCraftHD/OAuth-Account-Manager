package info.u_team.oauth_account_manager.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import info.u_team.oauth_account_manager.OAuthAccountManagerReference;
import net.hycrafthd.simple_minecraft_authenticator.SimpleMinecraftAuthentication;
import net.hycrafthd.simple_minecraft_authenticator.method.AuthenticationMethod;
import net.minecraft.server.LoggedPrintStream;

public class AuthenticationUtil {
	
	private static final HttpClient CLIENT = HttpClient.newHttpClient();
	
	public static CompletableFuture<Boolean> isAccessTokenValid(String accessToken) {
		final URI uri;
		try {
			uri = new URI(OAuthAccountManagerReference.ACCESS_TOKEN_VALID_ENDPOINT);
		} catch (URISyntaxException ex) {
			throw new AssertionError(ex);
		}
		
		final HttpRequest request = HttpRequest.newBuilder(uri) //
				.header("Authorization", "Bearer " + accessToken) //
				.timeout(Duration.ofSeconds(15)) //
				.GET() //
				.build();
		
		return CLIENT.sendAsync(request, BodyHandlers.discarding()).thenApply(response -> response.statusCode() == 200);
	}
	
	public static AuthenticationMethod createWebAuthenticationMethod() {
		return SimpleMinecraftAuthentication.getMethod("web").get().create(new LoggedPrintStream("OAuth-Account-Manager", System.out), System.in);
	}
}