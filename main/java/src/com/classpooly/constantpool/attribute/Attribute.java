package com.classpooly.constantpool.attribute;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 18:11
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public abstract class Attribute {

    public static final String ATTRIBUTE_CODE = "Code";
    public static final String ATTRIBUTE_INNER_CLASSES = "InnerClasses";
    public static final String ATTRIBUTE_SIGNATURE = "Signature";
    public static final String ATTRIBUTE_ANNOTATION_DEFAULT = "AnnotationDefault";
    public static final String ATTRIBUTE_EXCEPTIONS = "Exceptions";
    public static final String ATTRIBUTE_ENCLOSING_METHOD = "EnclosingMethod";
    public static final String ATTRIBUTE_LOCAL_VARIABLE_TABLE = "LocalVariableTable";
    public static final String ATTRIBUTE_CONSTANT_VALUE = "ConstantValue";
    public static final String ATTRIBUTE_BOOTSTRAP_METHODS = "BootstrapMethods";
    public static final String ATTRIBUTE_SYNTHETIC = "Synthetic";
    public static final String ATTRIBUTE_DEPRECATED = "Deprecated";
    public static final String ATTRIBUTE_LINE_NUMBER_TABLE = "LineNumberTable";
    public static final String ATTRIBUTE_SOURCE_FILE = "SourceFile";
    public static final String ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS = "RuntimeVisibleAnnotations";
    public static final String ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS = "RuntimeInvisibleAnnotations";
    public static final String ATTRIBUTE_RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS = "RuntimeVisibleParameterAnnotations";
    public static final String ATTRIBUTE_RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS = "RuntimeInvisibleParameterAnnotations";
    public static final String ATTRIBUTE_RUNTIME_VISIBLE_TYPE_ANNOTATIONS = "RuntimeVisibleTypeAnnotations";
    public static final String ATTRIBUTE_RUNTIME_INVISIBLE_TYPE_ANNOTATIONS = "RuntimeInvisibleTypeAnnotations";

    public int nameIndex;
    public int size;

    public Attribute(final DataInputStream stream) throws IOException {
        this.nameIndex = stream.readUnsignedShort();
        this.size = stream.readInt();
        final String name = ""; //TODO convert nameIndex to string
    }

    public static Attribute get(final String name, final DataInputStream stream) {
        switch (name) {
            default: {
                return null;
            }
        }
    }

    public abstract void read(final DataInputStream stream) throws IOException;
    public abstract String getName();
}
