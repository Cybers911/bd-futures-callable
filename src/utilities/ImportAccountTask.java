package utilities;

import java.util.concurrent.Callable;

public class ImportAccountTask implements Callable<AmazonMusicAccount> {

    private MusicAccountService accountService;
    private String accountID;

    public ImportAccountTask(MusicAccountService acctService, String acctID) {
        accountService = acctService;
        accountID = acctID;
    }

    @Override
    public AmazonMusicAccount call() {
        return accountService.getAccount(accountID);
    }
}
