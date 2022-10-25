import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private final Map<Client, List<Account>> clients;

    public Bank() {
        this.clients = new HashMap<>();
    }

    public void addClient(Client client, List<Account> accounts) {
        this.clients.put(client, accounts);
    }

    public List<Account> getAccountsByClient(Client client) {
        return this.clients.get(client);
    }

    public Client getClientByAccount(Account account) {
        Client client = null;
        for (Map.Entry<Client, List<Account>> entry : clients.entrySet()) {
            if (entry.getValue().contains(account)) {
                client = entry.getKey();
                break;
            }
        }
        return client;
    }
}