/*
 * Copyright (C) 2011 4th Line GmbH, Switzerland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.fourthline.konto.client.currency.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.web.bindery.event.shared.Event;
import org.fourthline.konto.shared.entity.MonetaryUnit;

/**
 * @author Christian Bauer
 */
public class MonetaryUnitModified extends Event<MonetaryUnitModified.Handler> {

    public static Type<Handler> TYPE = new Type<Handler>();

    public interface Handler extends EventHandler {
        public void onMonetaryUnitModified(MonetaryUnitModified event);
    }

    MonetaryUnit unit;

    public MonetaryUnitModified(MonetaryUnit unit) {
        this.unit = unit;
    }

    public MonetaryUnit getUnit() {
        return unit;
    }

    @Override
    public Type<Handler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(Handler handler) {
        handler.onMonetaryUnitModified(this);
    }
}
