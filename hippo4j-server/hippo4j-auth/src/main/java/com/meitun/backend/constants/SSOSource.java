/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.meitun.backend.constants;
// comments
@Deprecated
public enum SSOSource {

    Backend(Short.valueOf((short) 1), "backend"),
    BJ_Backend(Short.valueOf((short) 2), "bj_backend");

    private Short key;
    private String value;

    private SSOSource(Short key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValue(int key) {
        SSOSource[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            SSOSource c = var1[var3];
            if (c.getKey() == key) {
                return c.getValue();
            }
        }

        return null;
    }

    public Short getKey() {
        return this.key;
    }

    public void setKey(Short key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}