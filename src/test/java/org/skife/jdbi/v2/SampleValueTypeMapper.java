/*
 * Copyright (C) 2015 Zane Benefits
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.skife.jdbi.v2;

import org.skife.jdbi.v2.util.TypedMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class SampleValueTypeMapper extends TypedMapper<SampleValueType> {
    public SampleValueTypeMapper() {}

    @Override
    protected SampleValueType extractByName(ResultSet r, String name) throws SQLException {
        return SampleValueType.valueOf(r.getString(name));
    }

    @Override
    protected SampleValueType extractByIndex(ResultSet r, int index) throws SQLException {
        return SampleValueType.valueOf(r.getString(index));
    }
}
