public class Client {
    private final String fullName;
    private final int age;

    public Client(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (age != client.age) return false;
        return fullName != null ? fullName.equals(client.fullName) : client.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Клиент{" +
                "Ф.И.О. = '" + fullName + '\'' +
                ", возраст = " + age +
                '}';
    }
}