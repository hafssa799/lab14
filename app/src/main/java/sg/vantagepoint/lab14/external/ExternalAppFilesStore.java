package sg.vantagepoint.lab14.external;

import android.content.Context;

import java.io.File;
import java.nio.charset.StandardCharsets;import java.nio.file.Files;

public final class ExternalAppFilesStore {

    private ExternalAppFilesStore() {}

    public static String write(Context context, String fileName, String content) throws Exception {
        File dir = context.getExternalFilesDir(null);
        if (dir == null) return null;

        File file = new File(dir, fileName);

        // التعديل هنا: استخدام Files.write بدلاً من Files.writeString
        Files.write(file.toPath(), content.getBytes(StandardCharsets.UTF_8));

        return file.getAbsolutePath();
    }

    public static String read(Context context, String fileName) throws Exception {
        File dir = context.getExternalFilesDir(null);
        if (dir == null) return null;

        File file = new File(dir, fileName);
        if (!file.exists()) return null;

        // التعديل هنا: استخدام Files.readAllBytes بدلاً من Files.readString
        byte[] bytes = Files.readAllBytes(file.toPath());
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static boolean delete(Context context, String fileName) {
        File dir = context.getExternalFilesDir(null);
        if (dir == null) return false;

        File file = new File(dir, fileName);
        return file.delete();
    }
}