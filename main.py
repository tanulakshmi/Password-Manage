import java.net.URL;

public class URLFeatureExtractor {
    public static double[] extractFeatures(String url) {
        double[] features = new double[4]; // Adjust size based on features

        // Feature 1: Length of the URL
        features[0] = url.length();

        // Feature 2: Presence of special characters
        features[1] = (url.contains("@") || url.contains("#") || url.contains("?")) ? 1.0 : 0.0;

        // Feature 3: Use of HTTPS
        features[2] = url.startsWith("https") ? 1.0 : 0.0;

        // Feature 4: Domain reputation (dummy value for example)
        features[3] = getDomainReputation(url);

        return features;
    }

    private static double getDomainReputation(String url) {
        // Placeholder for domain reputation logic
        return Math.random(); // Replace with actual domain reputation logic
    }
}
