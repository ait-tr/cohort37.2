const playerJohn = {
    height: 170,
    weight: 80,
    sport: 'regbi',
    'full name': 'John Doe',
    sing: (songTheme) => {
        console.log(songTheme);
    }
}





console.log(playerJohn['height']);


playerJohn['height'] = 180;

console.log(playerJohn['height']);


// playerJohn['auto'] = 'Maseratti';


// console.log(playerJohn);

const arr = [['auto', 'Maseratti'], ['auto', 'Ford focus']];


playerJohn[arr[0][0]] = arr[0][1];

console.log(playerJohn);



////////////////////////////////////// DOM

const document = {
    html: {
        head: {},
        body: {
            h1: {

            },
            button: {
                classList: ['style1' , 'style3'],
                add('new style') { },
                
            }
        }
    }
}