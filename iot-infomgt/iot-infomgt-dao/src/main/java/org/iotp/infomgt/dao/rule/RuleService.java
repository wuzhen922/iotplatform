/*******************************************************************************
 * Copyright 2017 osswangxining@163.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
/**
 * Copyright © 2016-2017 The Thingsboard Authors
 *
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
package org.iotp.infomgt.dao.rule;

import java.util.List;

import org.iotp.infomgt.data.id.RuleId;
import org.iotp.infomgt.data.id.TenantId;
import org.iotp.infomgt.data.page.TextPageData;
import org.iotp.infomgt.data.page.TextPageLink;
import org.iotp.infomgt.data.rule.RuleMetaData;

import com.google.common.util.concurrent.ListenableFuture;

public interface RuleService {

    RuleMetaData saveRule(RuleMetaData device);

    RuleMetaData findRuleById(RuleId ruleId);

    ListenableFuture<RuleMetaData> findRuleByIdAsync(RuleId ruleId);

    List<RuleMetaData> findPluginRules(String pluginToken);

    TextPageData<RuleMetaData> findSystemRules(TextPageLink pageLink);

    TextPageData<RuleMetaData> findTenantRules(TenantId tenantId, TextPageLink pageLink);

    List<RuleMetaData> findSystemRules();

    TextPageData<RuleMetaData> findAllTenantRulesByTenantIdAndPageLink(TenantId tenantId, TextPageLink pageLink);

    List<RuleMetaData> findAllTenantRulesByTenantId(TenantId tenantId);

    void activateRuleById(RuleId ruleId);

    void suspendRuleById(RuleId ruleId);

    void deleteRuleById(RuleId ruleId);

    void deleteRulesByTenantId(TenantId tenantId);

}
