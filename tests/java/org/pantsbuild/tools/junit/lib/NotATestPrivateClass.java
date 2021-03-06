// Copyright 2016 Pants project contributors (see CONTRIBUTORS.md).
// Licensed under the Apache License, Version 2.0 (see LICENSE).

package org.pantsbuild.tools.junit.lib;

/**
 * This test is intentionally under a java_library() BUILD target so it will not be run
 * on its own. It is run by the ConsoleRunnerTest suite to test ConsoleRunnerImpl.
 */
public class NotATestPrivateClass {
  // If the runner is invoked with this private class name, it should just be ignored
  static private class PrivateClass {
    public void pc1() {
      TestRegistry.registerTestCall("pc1");
    }
  }
}
