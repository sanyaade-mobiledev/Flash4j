/************************************************************************
  IDataOutput.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
**************************************************************************/
package com.emitrom.air4j.core.client.utils;

import com.emitrom.air4j.core.client.net.ObjectEncoding;

public interface IDataOutput {

    public Endian getEndian();

    public void setEndian(Endian endian);

    public ObjectEncoding getObjectEncoding();

    public void setObjectEncoding(ObjectEncoding objectEncoding);

    public void writeBoolean(boolean value);

    public void writeByte(byte value);

    public void writeBytes(ByteArray bytes);

    public void writeBytes(ByteArray bytes, int offset);

    public void writeBytes(ByteArray bytes, int offset, int length);

    public void writeDouble(double value);

    public void writeFloat(float value);

    public void writeInt(int value);

    public void writeMultiByte(String value, String charset);

    public void writeObject(Object value);

    public void writeShort(short value);

    public void writeUnsignedByte(short value);

    public void writeUnsignedInt(double value);

    public void writeUnsignedShort(int value);

    public void writeUTF(String value);

    public void writeUTFBytes(String value);
}
