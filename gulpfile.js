var gulp = require('gulp');
var concat = require('gulp-concat');
//const clientPath = './src/main/webapp/';
//const tomcatPath = '/home/henrique/programas/apache-tomcat-8.5.29/webapps/vraptor-blank-project/';

gulp.task('watch', function(){
  gulp.watch('./src/main/webapp/WEB-INF/**/*.jsp', ['jsp']);
  gulp.watch('./src/main/webapp/css/**/*.css', ['css']);
  gulp.watch('./src/main/webapp/js/**/**/*.js', ['js']);
});


gulp.task('js', () => {
  gulp.src('./src/main/webapp/js/**/**/*')
    .pipe(gulp.dest('/home/henrique/programas/apache-tomcat-8.5.29/webapps/vraptor-blank-project/js/'))
});

gulp.task('css', () => {
  gulp.src('./src/main/webapp/css/**/**/*')
    .pipe(gulp.dest('/home/henrique/programas/apache-tomcat-8.5.29/webapps/vraptor-blank-project/css/'))
});

gulp.task('jsp', () =>{
  gulp.src('./src/main/webapp/WEB-INF/jsp/**/*')
    .pipe(gulp.dest('/home/henrique/programas/apache-tomcat-8.5.29/webapps/vraptor-blank-project/WEB-INF/jsp'))
});

// gulp.task('js', function() {
//   return gulp.src('./src/main/webapp/js/**/*.js')
//     .pipe(gulp.dest('/home/henrique/programas/apache-tomcat-8.5.29/webapps/vraptor-blank-project/js/'))
// });

gulp.task('default', ['watch']);

// const libsJS = [`${clientPath}/jquery-3.3.1.min.js`];

// gulp.task('javascript', () =>
//  gulp.src(`${clientPath}js/**/*`)
//    .pipe(gulp.dest(`./dist/js/page/`))
// );

// gulp.task('jsp', () =>
//  gulp.src(`${clientPath}WEB-INF/jsp/**/*`)
//    .pipe(gulp.dest(`./dist/WEB-INF/jsp/`))
// );

// gulp.task('watch', () => {
//  gulp.watch(`${clientPath}**/*.css`, ['css']);
//  gulp.watch([`${clientPath}js/**/*js`, `!${clientPath}js/page/**/*`]);
//  gulp.watch(`${clientPath}js/page/**/*js`, ['javascript']);
//  gulp.watch(`${clientPath}**/*.jsp`, ['jsp']);
// });

// gulp.task('default', ['watch']);