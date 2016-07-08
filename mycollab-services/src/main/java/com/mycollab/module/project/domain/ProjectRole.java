/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_prj_role*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_role")
public class ProjectRole extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.id
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.rolename
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    @Length(max=255, message="Field value is too long")
    @Column("rolename")
    private String rolename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.sAccountId
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.projectId
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    @Column("projectId")
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.isSystemRole
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    @Column("isSystemRole")
    private Boolean issystemrole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_role.description
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        ProjectRole item = (ProjectRole)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1317, 501).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.id
     *
     * @return the value of m_prj_role.id
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.id
     *
     * @param id the value for m_prj_role.id
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.rolename
     *
     * @return the value of m_prj_role.rolename
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.rolename
     *
     * @param rolename the value for m_prj_role.rolename
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.sAccountId
     *
     * @return the value of m_prj_role.sAccountId
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.sAccountId
     *
     * @param saccountid the value for m_prj_role.sAccountId
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.projectId
     *
     * @return the value of m_prj_role.projectId
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.projectId
     *
     * @param projectid the value for m_prj_role.projectId
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.isSystemRole
     *
     * @return the value of m_prj_role.isSystemRole
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public Boolean getIssystemrole() {
        return issystemrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.isSystemRole
     *
     * @param issystemrole the value for m_prj_role.isSystemRole
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public void setIssystemrole(Boolean issystemrole) {
        this.issystemrole = issystemrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_role.description
     *
     * @return the value of m_prj_role.description
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_role.description
     *
     * @param description the value for m_prj_role.description
     *
     * @mbggenerated Thu Jun 30 11:43:04 ICT 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        rolename,
        saccountid,
        projectid,
        issystemrole,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}