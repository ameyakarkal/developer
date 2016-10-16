using System.Web.Http;

namespace LogicAppWebApi.Controllers
{
    public class StatusController : ApiController
    {
        [HttpGet]
        [Route("status")]
        public IHttpActionResult Index()
        {
            return Ok();
        }
    }
}