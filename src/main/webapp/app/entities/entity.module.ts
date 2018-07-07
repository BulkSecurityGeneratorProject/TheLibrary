import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { TheLibraryAuthorModule } from './author/author.module';
import { TheLibraryBookModule } from './book/book.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        TheLibraryAuthorModule,
        TheLibraryBookModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class TheLibraryEntityModule {}
