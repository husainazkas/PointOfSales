/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author husainazkas
 */
@Entity
@Table(name = "master_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(insertable = false, updatable = false)
    private String username;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private Date updatedAt;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Date createdAt;

    @Column(name = "created_by", updatable = false)
    private Long createdBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (username != null ? username.hashCode() : 0);
        hash += (roleId != null ? roleId.hashCode() : 0);
        hash += (updatedAt != null ? updatedAt.hashCode() : 0);
        hash += (updatedBy != null ? updatedBy.hashCode() : 0);
        hash += (createdAt != null ? createdAt.hashCode() : 0);
        hash += (createdBy != null ? createdBy.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        if ((this.updatedAt == null && other.updatedAt != null) || (this.updatedAt != null && !this.updatedAt.equals(other.updatedAt))) {
            return false;
        }
        if ((this.updatedBy == null && other.updatedBy != null) || (this.updatedBy != null && !this.updatedBy.equals(other.updatedBy))) {
            return false;
        }
        if ((this.createdAt == null && other.createdAt != null) || (this.createdAt != null && !this.createdAt.equals(other.createdAt))) {
            return false;
        }
        return !((this.createdBy == null && other.createdBy != null) || (this.createdBy != null && !this.createdBy.equals(other.createdBy)));
    }

    @Override
    public String toString() {
        return "pos.model.User[ id=" + id + ", username=" + username + ", roleId=" + roleId + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + ", createdAt=" + createdAt + ", createdBy=" + createdBy + " ]";
    }

}
