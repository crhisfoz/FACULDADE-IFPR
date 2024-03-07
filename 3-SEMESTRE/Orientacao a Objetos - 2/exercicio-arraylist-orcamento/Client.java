public class Client {
    String name;
    String cpf;
    String phone;
    String budget[] = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String fone) {
        this.phone = fone;
    }

    public String[] getBudget() {
        return budget;
    }

    public void setBudget(String[] budget) {
        this.budget = budget;
    }

}