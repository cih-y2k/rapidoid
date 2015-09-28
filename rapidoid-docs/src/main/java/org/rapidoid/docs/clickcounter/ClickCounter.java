package org.rapidoid.docs.clickcounter;

import org.rapidoid.annotation.Page;
import org.rapidoid.annotation.Web;
import org.rapidoid.app.GUI;
import org.rapidoid.html.Tag;
import org.rapidoid.widget.ButtonWidget;

/*
 * #%L
 * rapidoid-docs
 * %%
 * Copyright (C) 2014 - 2015 Nikolche Mihajlovski and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

@Web
public class ClickCounter extends GUI {

	int n = 0;

	@Page
	public Object counter() {
		ButtonWidget inc = btn("+").onClick(new Runnable() {
			@Override
			public void run() {
				n++;
			}
		});

		Tag info = span("You clicked ", n, " times!");

		return row(info, inc);
	}

}