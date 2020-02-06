package com.intellij.sdk.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.sdk.language.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SimpleFile extends PsiFileBase {
  public SimpleFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, SimpleLanguage.INSTANCE);
  }
  
  @NotNull
  @Override
  public FileType getFileType() {
    return SimpleFileType.INSTANCE;
  }
  
  @Override
  public String toString() {
    return "Simple File";
  }
  
  @Override
  public Icon getIcon(int flags) {
    return super.getIcon(flags);
  }
}