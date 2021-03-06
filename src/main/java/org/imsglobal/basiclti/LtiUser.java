package org.imsglobal.basiclti;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by paul on 5/28/14.
 */
public class LtiUser {

    private String id;
    private List<String> roles;

    public LtiUser(HttpServletRequest request) {
        this.id = request.getParameter("user_id");
        this.roles = new LinkedList<>();
        if(request.getParameter("roles") != null) {
            for (String role : request.getParameter("roles").split(",")) {
                this.roles.add(role.trim());
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}
