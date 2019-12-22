package com.hyperskilldev.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddFiles {
      public List<File> getAllFiles(File rootDir) {
              File[] children = rootDir.listFiles();
              if (children == null || children.length == 0) {
                      return Collections.emptyList();
                  }

              List<File> files = new ArrayList<>();
              for (File child : children) {
                      if (child.isDirectory()) {
                             files.addAll(getAllFiles(child));
                         } else {
                             files.add(child);
                         }
                 }

             return files;
        }
}
