package com.pdehaan.flatbuffers;

import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import com.pdehaan.flatbuffers.psi.FlatbuffersFieldDecl;
import com.pdehaan.flatbuffers.psi.FlatbuffersFieldName;
import org.jetbrains.annotations.NotNull;

/**
 * Created by pdehaan on 8/28/16.
 */
public class FlatbuffersAnnotator implements Annotator
{
    @Override
    public void annotate(
        @NotNull PsiElement psiElement,
        @NotNull AnnotationHolder annotationHolder
    )
    {
        if (psiElement instanceof FlatbuffersFieldDecl)
        {
            FlatbuffersFieldName fieldName = ((FlatbuffersFieldDecl) psiElement).getFieldName();
            Annotation annotation = annotationHolder.createInfoAnnotation(fieldName.getTextRange(), null);
            annotation.setTextAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD);
        }
    }
}
