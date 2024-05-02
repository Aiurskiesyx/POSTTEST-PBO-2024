import java.io.BufferedReader;
import java.io.IOException;

class LoginHandler implements Login {
    private final BufferedReader br;

    public LoginHandler(BufferedReader br) {
        this.br = br;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "123".equals(password);
    }

    @Override
public void displayLoginPrompt() {
    boolean isAuthenticated = false;

    while (!isAuthenticated) {
        System.out.println("SELAMAT DATANG KE PROGRAM PENDATAAN HIJAB");
        System.out.println("D'LUXURY STORE");
        System.out.println("=============================================");
        try {
            System.out.println("Silahkan Masukkan Username:");
            String username = br.readLine();
            System.out.println("Silahkan Masukkan Password:");
            String password = br.readLine(); 
            
            isAuthenticated = authenticate(username, password);

            if (isAuthenticated) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal! Periksa kembali username dan password Anda.");
            }
        } catch (IOException e) {
            System.out.println("Error saat membaca input: " + e.getMessage());
        }
        System.out.println("=============================================");
    }
}

}
