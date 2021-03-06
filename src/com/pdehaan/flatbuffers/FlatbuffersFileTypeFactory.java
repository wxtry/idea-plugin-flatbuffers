package com.pdehaan.flatbuffers;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by pdehaan on 8/27/16.
 */
public class FlatbuffersFileTypeFactory extends FileTypeFactory
{
    @Override public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer)
    {
        fileTypeConsumer.consume(FlatbuffersFileType.INSTANCE, "flatbuffers");
    }
}
