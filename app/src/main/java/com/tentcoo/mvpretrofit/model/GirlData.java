/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com>
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
 *
 */
package com.tentcoo.mvpretrofit.model;

import com.tentcoo.mvpretrofit.bean.PhotoGirl;

import java.io.Serializable;
import java.util.List;

public class GirlData{
    private int status;
    private List<PhotoGirl> banner;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<PhotoGirl> getBanner() {
        return banner;
    }

    public void setBanner(List<PhotoGirl> banner) {
        this.banner = banner;
    }
}
