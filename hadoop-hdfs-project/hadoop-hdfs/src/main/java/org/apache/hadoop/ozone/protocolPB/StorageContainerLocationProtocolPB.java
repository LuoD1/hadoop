/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.ozone.protocolPB;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.ozone.protocol.proto.StorageContainerLocationProtocolProtos.StorageContainerLocationProtocolService;

/**
 * Protocol used from an HDFS node to StorageContainerManager.  This extends the
 * Protocol Buffers service interface to add Hadoop-specific annotations.
 */
@ProtocolInfo(protocolName =
    "org.apache.hadoop.ozone.protocol.StorageContainerLocationProtocol",
    protocolVersion = 1)
@InterfaceAudience.Private
public interface StorageContainerLocationProtocolPB
    extends StorageContainerLocationProtocolService.BlockingInterface {
}
