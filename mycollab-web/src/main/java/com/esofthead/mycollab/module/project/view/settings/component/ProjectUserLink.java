/**
 * This file is part of mycollab-web.
 *
 * mycollab-web is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-web is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-web.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.project.view.settings.component;

import com.esofthead.mycollab.configuration.SiteConfiguration;
import com.esofthead.mycollab.module.project.CurrentProjectVariables;
import com.esofthead.mycollab.module.project.LabelLink;
import com.esofthead.mycollab.module.project.ProjectLinkBuilder;
import com.esofthead.mycollab.vaadin.ui.UIConstants;

/**
 * 
 * @author MyCollab Ltd.
 * @since 1.0
 * 
 */
public class ProjectUserLink extends LabelLink {
	private static final long serialVersionUID = 1L;

	public ProjectUserLink(final String username, String userAvatarId,
			final String displayName) {
		this(username, userAvatarId, displayName, true, true);
	}

	public ProjectUserLink(final String username, String userAvatarId,
			final String displayName, boolean useWordWrap,
			boolean isDisplayAvatar) {

		super(displayName, ProjectLinkBuilder.generateProjectMemberFullLink(
				CurrentProjectVariables.getProjectId(), username));

		if (isDisplayAvatar && username != null && !username.equals("")) {
			String link = SiteConfiguration.getAvatarLink(userAvatarId, 16);

			this.setIconLink(link);
		}

		this.setStyleName("link");

		if (useWordWrap) {
			this.addStyleName(UIConstants.WORD_WRAP);
		}
	}
}