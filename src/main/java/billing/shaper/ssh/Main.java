package billing.shaper.ssh;

public class Main {
    public static void main(String[] args) {
        SshExecutor sshExecutor = new SshExecutor();
        sshExecutor.exec("top");
    }
}
