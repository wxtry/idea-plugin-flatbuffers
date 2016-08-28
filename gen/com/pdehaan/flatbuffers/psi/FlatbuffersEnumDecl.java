// This is a generated file. Not intended for manual editing.
package com.pdehaan.flatbuffers.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FlatbuffersEnumDecl extends PsiElement {

  @NotNull
  List<FlatbuffersEnumvalDecl> getEnumvalDeclList();

  @NotNull
  FlatbuffersMetadata getMetadata();

  @Nullable
  FlatbuffersType getType();

  @NotNull
  FlatbuffersTypeDeclName getTypeDeclName();

}
