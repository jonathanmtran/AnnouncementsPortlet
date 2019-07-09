/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.portlet.announcements.xml;

/**
 * Namespaces to use for XML Schema generation and JAXB
 *
 * @author James Wennmacher, jwennmacher@unicon.net
 * @version $Id: $Id
 */
public interface Namespaces {

  /** Constant <code>TOPIC_NAMESPACE="http://www.uPortal.org/schema/announcem"{trunked}</code> */
  public static final String TOPIC_NAMESPACE = "http://www.uPortal.org/schema/announcement/topic";
  /** Constant <code>TOPIC_SUBSCRIPTION_NAMESPACE="http://www.uPortal.org/schema/announcem"{trunked}</code> */
  public static final String TOPIC_SUBSCRIPTION_NAMESPACE =
      "http://www.uPortal.org/schema/announcement/topicSubscription";
  /** Constant <code>ANNOUNCEMENT_NAMESPACE="http://www.uPortal.org/schema/announcem"{trunked}</code> */
  public static final String ANNOUNCEMENT_NAMESPACE =
      "http://www.uPortal.org/schema/announcement/announcement";
}
