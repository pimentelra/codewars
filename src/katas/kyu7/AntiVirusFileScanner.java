package katas.kyu7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class AntiVirusFileScanner {
}

public class AntiVirus {
    private int scanIntensity = 0;

    public void setScanIntensity(int level) {
        scanIntensity = level;
    }

    public String scanFile(File file, VirusDB database) {
        Set<String> signatures = new HashSet<>();
        IntStream.rangeClosed(0, scanIntensity).forEach(i -> Collections.addAll(signatures, database.getSignatures(i)));
        String data = file.getData();
        for (String signature : signatures)
            if (data.toLowerCase().contains(signature.toLowerCase())) return file.getName() + " is not safe";
        return file.getName() + " is safe";
    }
}
