package util;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEnecodingFilter implements Filter {
    private FilterConfig fc;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.fc = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String caracterEncoding = servletRequest.getCharacterEncoding();
        if (servletRequest.getCharacterEncoding() == null) {
            //caracterEncoding = "UTF-8";
            String characterEncoding = fc.getInitParameter("CharacterEncoding");
            servletRequest.setCharacterEncoding(characterEncoding);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
