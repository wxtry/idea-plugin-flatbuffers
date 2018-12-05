// This is a generated file. Not intended for manual editing.
package com.pdehaan.flatbuffers.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.pdehaan.flatbuffers.psi.FlatbuffersTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.pdehaan.flatbuffers.psi.*;

public class FlatbuffersIncludeDeclImpl extends ASTWrapperPsiElement implements FlatbuffersIncludeDecl {

  public FlatbuffersIncludeDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FlatbuffersVisitor visitor) {
    visitor.visitIncludeDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FlatbuffersVisitor) accept((FlatbuffersVisitor)visitor);
    else super.accept(visitor);
  }

}
