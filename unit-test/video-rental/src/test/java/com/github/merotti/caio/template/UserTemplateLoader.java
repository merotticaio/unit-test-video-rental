package com.github.merotti.caio.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.github.merotti.caio.entities.User;

import static com.github.merotti.caio.support.FixtureTemplate.*;

public class UserTemplateLoader implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(User.class).addTemplate(VALID.name(), new Rule() {
            {
                add("name", random("Antonio Theo Farias", "Luís Fernando Ramos", "Sebastiana Isabel Lima"));
            }
        });
    }

}
