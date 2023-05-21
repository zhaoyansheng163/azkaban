/*
 * Copyright 2020 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
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

package webapp.error;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CookieFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response,
      FilterChain chain) throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse resp = (HttpServletResponse) response;

    Cookie[] cookies = req.getCookies();

    if (cookies != null) {
      Cookie cookie = cookies[0];
//      String action = request.getParameter("action") != null ? request.getParameter("action") : "";
//      if (cookie != null && !("login".equals(action))) {
      if (cookie != null) {
        //cookie.setMaxAge(3600);
        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        resp.addCookie(cookie);
      }
//      if (null != cookies) {
//        for (int i = 0; i < cookies.length; i++) {
//          cookies[i].setSecure(true);
//          cookies[i].setHttpOnly(true);
//          resp.addCookie(cookies[i]);
//        }
//      }
    }
    //|| "/".equals(req.getRequestURI()
    else if("/toL".equals(req.getRequestURI())){
      HttpSession session = req.getSession();
      String session_id = session.getId();
      Cookie cookie = new Cookie("JSESSIONID", session_id);
      cookie.setPath("/");
      cookie.setSecure(true);
      resp.addCookie(cookie);
      resp.sendRedirect("/toL");
    }
    chain.doFilter(req, resp);
  }

  @Override
  public void destroy() {
  }

  @Override
  public void init(FilterConfig arg0) throws ServletException {
  }
}