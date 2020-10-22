package tr.com.ogedik.apigateway.filter;

import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import tr.com.ogedik.apigateway.wrapper.ProxyFilterWrapper;

import javax.servlet.http.HttpServletRequest;

/** @author orkun.gedik */
@Component
public class RoutingFilter extends ProxyFilterWrapper {

  @Override
  public void construct() {
    super.construct(RoutingFilter.class, FilterConstants.ROUTE_TYPE, 1, true);
  }

  @Override
  public Object run() {
    HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

    logger.info(
        "{}: {} request to {}",
        filterType(),
        request.getMethod(),
        request.getRequestURL().toString());

    return null;
  }
}
