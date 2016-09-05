using System.Web.Http;

namespace WebApi.Controllers
{
    [RoutePrefix("status")]
    public class StatusController : ApiController
    {
        [HttpGet]
        [Route("")]
        public IHttpActionResult Index()
        {
            return Ok("ok"); 
        }
    }
}