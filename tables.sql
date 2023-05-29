create table Users(
                      id serial primary key,
                      name varchar(255) not null,
                      login varchar(255) not null,
                      password varchar(255)not null,
                      description text
);

create table Tags(
                     id serial primary key,
                     title varchar(255) not null
);

create table Recipes(
                        id serial primary key,
                        title varchar(255) not null ,
                        description text,
                        cooking_time smallint not null,
                        serving_number smallint not null,
                        user_id int not null,
                        tag_id int not null,
                        image varchar(255) not null,
                        foreign key (user_id) references Users(id),
                        foreign key (tag_id) references Tags(id)
);

create table Ingredients (
                             id serial primary key,
                             block_name varchar(255) not null,
                             content text not null,
                             recipe_id int not null,
                             foreign key (recipe_id) references Recipes(id)
);

create table Steps (
                       id serial primary key,
                       content text not null,
                       recipe_id int not null,
                       foreign key (recipe_id) references Recipes(id)
);

create table User_Recipe_Likes (
                                   user_id int not null,
                                   recipe_id int not null,
                                   like_status boolean default false,
                                   primary key (user_id, recipe_id),
                                   foreign key (user_id) references Users(id),
                                   foreign key (recipe_id) references Recipes(id)
);

create table Recipe_Tag (
                            recipe_id int not null,
                            tag_id int not null,
                            primary key (recipe_id, tag_id),
                            foreign key (recipe_id) references Recipes(id),
                            foreign key (tag_id) references Tags(id)
);
