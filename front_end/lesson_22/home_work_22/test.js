const getGithubData = async (q) => {
    const response = await fetch(q);
            const data = await response.json();
            return data;
        }
    
    
    const githubDataKate = async (adresse) => {
            const responseData = await getGithubData(adresse);
               pushToHTMLName(responseData.name);
               pushToHTMLImg(responseData.avatar_url);
    
    }
    
    const pushToHTMLName = (objectName) => {
        const container = document.querySelector('#info');
        const nameElement = document.createElement('h1');
        nameElement.textContent = objectName;
        container.appendChild(nameElement);
    };
    const pushToHTMLImg = (objectImg) => {
        const container = document.querySelector('#img');
        const imgElement = document.createElement('img');
        imgElement.src = objectImg;
        container.appendChild(imgElement);
    };
    
    
    githubDataKate('https://api.github.com/users/kate8kate')