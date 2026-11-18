package finall;

import java.io.InputStream;

import javafx.scene.image.Image;

public class ImageHelper {

    private ImageHelper() {
    }

    public static Image load(String fileName) {
        String resourcePath = "/images/" + fileName;
        InputStream stream = ImageHelper.class.getResourceAsStream(resourcePath);

        if (stream == null) {
            throw new IllegalArgumentException(
                    "Image not found: " + resourcePath +
                            ". Put the image inside the project's images folder.");
        }

        return new Image(stream);
    }
}
