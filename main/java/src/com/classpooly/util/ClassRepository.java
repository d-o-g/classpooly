package com.classpooly.util;

import com.classpooly.structure.BytecodeClass;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.*;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 13:48
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public final class ClassRepository {

    private static final Map<String, BytecodeClass> classes = new HashMap<>();

    private ClassRepository() {}

    public static Map<String, BytecodeClass> fromJar(final String name) {
        if (classes.size() > 0)
            return classes;
        try (final JarFile jf = new JarFile(name)) {
            final JarInputStream in = new JarInputStream(new FileInputStream(name));
            for (JarEntry entry = in.getNextJarEntry(); entry != null; entry = in.getNextJarEntry()) {
                final String entryName = entry.getName();
                if (!entryName.endsWith(".class"))
                    continue;
                final BytecodeClass bc = new BytecodeClass(new DataInputStream(jf.getInputStream(entry)));
                classes.put(entryName.replace(".class", ""), bc);
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return classes;
    }

    public static Map<String, BytecodeClass> get() {
        return classes;
    }

    public static void clear() {
        classes.clear();
    }
}
