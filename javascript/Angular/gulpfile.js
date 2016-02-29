var gulp = require("gulp"),
	concat = require("gulp-concat"),
	template = require("gulp-angular-templateCache");
var paths = {

	app : "Web/app",
	
	scripts : [
		"Web/Scripts/**/*.js"
	],
	templates : [
		"Web/Scripts/templates/**/*.html"
	],
	vendor : [
		"bower_components/angular/angular.min.js",
		"bower_components/angular-ui-router/release/angular-ui-router.js"
	]
};

var defaultTasks =[
"concat",
"concat-vendor",
"template",
"watch"
];

gulp.task("concat", function(){
	return gulp.src(paths.scripts)
	.pipe(concat("app.min.js"))
	.pipe(gulp.dest(paths.app));
});

gulp.task("concat-vendor", function(){
	return gulp.src(paths.vendor)
	.pipe(concat("vendor.min.js", { newLine : ";" }))
	.pipe(gulp.dest(paths.app));

});

gulp.task("template", function(){
	return gulp.src(paths.templates)
		.pipe(template("templates.min.js", {module : "frictionless.app.templates", standalone : true } ))
		.pipe(gulp.dest(paths.app))
});
gulp.task("watch", function(){
	gulp.watch(paths.scripts, ["concat"]);
	gulp.watch(paths.templates, ["template"]);

});

gulp.task("default", defaultTasks);
	