/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH & Co. KG (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ui.apps.linkvalidation;

import org.opencms.file.CmsResource;
import org.opencms.ui.CmsVaadinUtils;
import org.opencms.ui.components.CmsBasicDialog;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * Dialog to show list of resources.<p>
 */
public class CmsResourceListDialog extends CmsBasicDialog {

    /**vaadin serial id.*/
    private static final long serialVersionUID = 4057378669920436467L;

    /**The close button. */
    private Button m_cancel;

    /**
     * Public constructor.<p>
     *
     * @param resources List of resources
     */
    public CmsResourceListDialog(List<CmsResource> resources) {

        CmsVaadinUtils.readAndLocalizeDesign(this, CmsVaadinUtils.getWpMessagesForCurrentLocale(), null);
        if (resources.size() < 50) {
            displayResourceInfo(resources, null);
            setContentVisibility(false);
        }
        m_cancel.addClickListener(new ClickListener() {

            private static final long serialVersionUID = 8446069481164202478L;

            public void buttonClick(ClickEvent event) {

                CmsVaadinUtils.getWindow(CmsResourceListDialog.this).close();

            }

        });
    }
}
