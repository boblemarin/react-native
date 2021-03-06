/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.bridge;

import java.util.HashMap;

/**
 * Interface for a map that allows typed access to its members. Used to pass parameters from JS to
 * Java.
 */
public interface ReadableMap {

  boolean hasKey(String name);
  boolean isNull(String name);
  boolean getBoolean(String name);
  double getDouble(String name);
  int getInt(String name);
  String getString(String name);
  ReadableArray getArray(String name);
  ReadableMap getMap(String name);
  Dynamic getDynamic(String name);
  ReadableType getType(String name);
  ReadableMapKeySetIterator keySetIterator();
  HashMap<String, Object> toHashMap();

}
