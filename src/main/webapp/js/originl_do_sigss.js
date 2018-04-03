var gulp = require('gulp');
var concat = require('gulp-concat');

const clientPath = './src/main/webapp/';
const tomcatPath = './../../Documentos/apache-tomcat-8.5.20-SIGSS/';

const sigssPath = `${tomcatPath}webapps/sigss/`;

const libsJS = [`${clientPath}/js/lib/moment.js`,
               `${clientPath}/js/jquery/jquery-1.9.2.min.js`,
               `${clientPath}/js/jquery/jquery-migrate-1.1.0.min.js`,
               `${clientPath}/js/jquery/jquery-ui-1.9.2.custom.min.js`,
               `${clientPath}/js/jquery/jqGrid/i18n/grid.locale-pt-br.js`,
               `${clientPath}/js/jquery/jqGrid/jquery.jqGrid.min.js`,
               `${clientPath}/js/jquery/jqGrid/autosearch.js`,
               `${clientPath}/js/jquery/jquery.maskedinput.js`,
               `${clientPath}/js/sys/js.cookie.js`,
               `${clientPath}/js/sys/jquery.i18n.properties-min-1.0.9.js`,
               `${clientPath}/js/sys/internacionalizacao.js`,
               `${clientPath}/js/jquery/ui.checkbox.js`,
               `${clientPath}/js/jquery/chosen/chosen.jquery.js`,
               `${clientPath}/js/sys/prototypeUtil.js`,
               `${clientPath}/js/sys/dateTimeUtil.js`,
               `${clientPath}/js/sys/form.js`,
               `${clientPath}/js/sys/avisoPaciente.js`,
               `${clientPath}/js/sys/medida.js`,
               `${clientPath}/js/sys/plugin.combobox.js`,
               `${clientPath}/js/sys/plugin.textarea.js`,
               `${clientPath}/js/sys/plugin.formatFloat.js`,
               `${clientPath}/js/jquery/tools/jquery.printElement.js`,
               `${clientPath}/js/sys/plugin.print.js`,
               `${clientPath}/js/sys/thickbox.js`,
               `${clientPath}/js/sys/plugin.validator.tools.js`,
               `${clientPath}/js/jquery/tools/jquerytools.validators.js`,
               `${clientPath}/js/sys/keycode.event.js`,
               `${clientPath}/js/sys/lockRegistro.js`,
               `${clientPath}/js/helper/string-helper.js`,
               `${clientPath}/js/jquery/jquery.tools.min.js`,
               `${clientPath}/js/touch.js`,
               `${clientPath}/js/colpick.js`,
               `${clientPath}/js/sys/ajuda.js`,
               `${clientPath}/js/sys/mensagensPadraoSistema.js`,
               `${clientPath}/js/sys/Sigss.js`,
               `${clientPath}/js/sys/jquery.dialog.js`];

gulp.task('javascript', () =>
 gulp.src(`${clientPath}js/page/**/*`)
   .pipe(gulp.dest(`${sigssPath}js/page/`))
);

gulp.task('css', () =>
 gulp.src(`${clientPath}css/**/*`)
   .pipe(gulp.dest(`${sigssPath}css/`))
);

gulp.task('jsp', ['principal'], () =>
 gulp.src(`${clientPath}WEB-INF/jsp/**/*`)
   .pipe(gulp.dest(`${sigssPath}WEB-INF/jsp/`))
);

gulp.task('principal', () =>
 gulp.src(`${clientPath}WEB-INF/decorators/**/*`)
   .pipe(gulp.dest(`${sigssPath}WEB-INF/decorators/`))
);

gulp.task('allCompact', () =>
 gulp.src(libsJS)
   .pipe(concat('all.compact.js'))
   .pipe(gulp.dest(`${clientPath}/js/`))
   .pipe(gulp.dest(`${sigssPath}/js/`))
);

gulp.task('watch', () => {
 gulp.watch(`${clientPath}**/*.css`, ['css']);
 gulp.watch([`${clientPath}js/**/*js`, `!${clientPath}js/page/**/*`, `!${clientPath}js/all.compact.js`], ['allCompact']);
 gulp.watch(`${clientPath}js/page/**/*js`, ['javascript']);
 gulp.watch(`${clientPath}**/*.jsp`, ['jsp']);
});

gulp.task('default', ['watch']);