package info.u_team.oauth_account_manager.data.provider;

import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_ACCOUNTS_ADD_BUTTON;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_ACCOUNTS_DELETE_BUTTON;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_ACCOUNTS_TITLE;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_ACCOUNTS_USE_BUTTON;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_ADD_ACCOUNT_OPEN_LINK_MESSAGE;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_ADD_ACCOUNT_OPEN_LINK_TITLE;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_MULTIPLAYER_ADDITION_ACCOUNT_BUTTON;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_MULTIPLAYER_ADDITION_ACCOUNT_BUTTON_TOOLTIP_CHECKING;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_MULTIPLAYER_ADDITION_ACCOUNT_BUTTON_TOOLTIP_INVALID;
import static info.u_team.oauth_account_manager.init.OAuthAccountManagerLocalization.SCREEN_MULTIPLAYER_ADDITION_ACCOUNT_BUTTON_TOOLTIP_VALID;

import info.u_team.u_team_core.data.CommonLanguagesProvider;
import info.u_team.u_team_core.data.GenerationData;

public class OAuthAccountManagerLanguagesProvider extends CommonLanguagesProvider {
	
	public OAuthAccountManagerLanguagesProvider(GenerationData data) {
		super(data);
	}
	
	@Override
	public void register() {
		add(SCREEN_ACCOUNTS_TITLE, "Manage Minecraft Accounts");
		add(SCREEN_ACCOUNTS_USE_BUTTON, "Use Account");
		add(SCREEN_ACCOUNTS_ADD_BUTTON, "Add Account");
		add(SCREEN_ACCOUNTS_DELETE_BUTTON, "Delete");
		
		add(SCREEN_ADD_ACCOUNT_OPEN_LINK_TITLE, "Add new Minecraft Account");
		add(SCREEN_ADD_ACCOUNT_OPEN_LINK_MESSAGE, "Open the following link by clicking 'Open' or 'Copy to Clipboard'");
		
		add(SCREEN_MULTIPLAYER_ADDITION_ACCOUNT_BUTTON, "Accounts");
		add(SCREEN_MULTIPLAYER_ADDITION_ACCOUNT_BUTTON_TOOLTIP_CHECKING, "Checking current account session");
		add(SCREEN_MULTIPLAYER_ADDITION_ACCOUNT_BUTTON_TOOLTIP_VALID, "You are currently logged in as %s");
		add(SCREEN_MULTIPLAYER_ADDITION_ACCOUNT_BUTTON_TOOLTIP_INVALID, "Session token is invalid");
	}
	
}
