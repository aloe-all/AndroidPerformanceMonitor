/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.moduth.blockcanary;

import android.content.Context;
import android.os.Handler;

import java.io.File;

/**
 * Created by Abner on 16/1/21.
 * Email nimengbo@gmail.com
 * github https://github.com/nimengbo
 */
public interface IBlockCanaryContext {

    int getConfigBlockThreshold();

    boolean isNeedDisplay();

    Handler getWriteLogFileThreadHandler();

    Handler getTimerThreadHandler();

    String getQualifier();

    String getUid();

    String getNetworkType();

    Context getContext();

    String getLogPath();

    boolean zipLogFile(File[] src, File dest);

    void uploadLogFile(File zippedFile);
}
