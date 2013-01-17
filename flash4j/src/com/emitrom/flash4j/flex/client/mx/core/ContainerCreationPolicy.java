/************************************************************************
  ContainerCreationPolicy.java is part of Flash4j 3.0.0  Copyright 2012 Emitrom LLC

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
package com.emitrom.flash4j.flex.client.mx.core;

/**
 * The Enum ContainerCreationPolicy.
 */
public enum ContainerCreationPolicy {

    /** The ALL. */
    ALL("all"),

    /** The AUTO. */
    AUTO("auto"),

    /** The NONE. */
    NONE("none"),

    /** The QUEUED. */
    QUEUED("qeueud");

    /** The value. */
    public final String value;

    /**
     * Instantiates a new container creation policy.
     * 
     * @param policy the policy
     */
    private ContainerCreationPolicy(String policy) {
        value = policy;
    }

    /**
     * From value.
     * 
     * @param value the value
     * @return the container creation policy
     */
    public static native ContainerCreationPolicy fromValue(String value) /*-{
		switch (value) {
		case 'all':
			return @com.emitrom.flash4j.flex.client.mx.core.ContainerCreationPolicy::ALL;
		case 'auto':
			return @com.emitrom.flash4j.flex.client.mx.core.ContainerCreationPolicy::AUTO;
		case 'none':
			return @com.emitrom.flash4j.flex.client.mx.core.ContainerCreationPolicy::NONE;
		case 'qeueud':
			return @com.emitrom.flash4j.flex.client.mx.core.ContainerCreationPolicy::QUEUED;
		}
    }-*/;
}
