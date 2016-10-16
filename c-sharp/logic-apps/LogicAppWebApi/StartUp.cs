using System.Net.Http.Formatting;
using System.Web.Http;
using Owin;
using Swashbuckle.Application;

namespace LogicAppWebApi
{
    public class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            var httpConfiguration = new HttpConfiguration();

            httpConfiguration.Formatters.Clear();
            httpConfiguration.Formatters.Add(new JsonMediaTypeFormatter());

            httpConfiguration
                .EnableSwagger(c => c.SingleApiVersion("v1", "A title for your API"))
                .EnableSwaggerUi();

            httpConfiguration.MapHttpAttributeRoutes();

            app.UseWebApi(httpConfiguration);
        }
    }
}