import java.nio.charset.StandardCharsets;

public class HexConverter {

    // Convert string to hex
    public static String toHex(String text) {
        StringBuilder hex = new StringBuilder();
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes) {
            hex.append(String.format("%02X", b));
        }
        return hex.toString();
    }

    // Convert hex back to string
    public static String fromHex(String hex) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < hex.length(); i += 2) {
            String hexPair = hex.substring(i, i + 2);
            char character = (char) Integer.parseInt(hexPair, 16);
            text.append(character);
        }
        return text.toString();
    }

    public static void main(String[] args) {
        String original = "Hello, Crypto!";
        String hexEncoded = toHex(original);
        String decoded = fromHex(hexEncoded);

        System.out.println("Original: " + original);
        System.out.println("Hex Encoded: " + hexEncoded);
        System.out.println("Decoded: " + decoded);
    }
}
