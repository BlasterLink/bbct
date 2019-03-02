/*
 * This file is part of BBCT for Android.
 *
 * Copyright 2018 codeguru <codeguru@users.sourceforge.net>
 *
 * BBCT for Android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BBCT for Android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bbct.android.lite.activity.test;

import androidx.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

import bbct.android.common.navigation.test.NavigateUpFromAboutTest;
import bbct.android.lite.provider.LiteActivity;

@RunWith(AndroidJUnit4.class)
public class LiteActivityNavigateUpFromAboutTest extends NavigateUpFromAboutTest<LiteActivity> {
    public LiteActivityNavigateUpFromAboutTest() {
        super(LiteActivity.class);
    }
}
