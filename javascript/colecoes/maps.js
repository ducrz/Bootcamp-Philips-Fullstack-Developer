const getAdmins = (map) => {
    let admins = [];

    for ([key, value] of map) {
        if (value === 'ADMIN') {
            admins.push(key);
        }
    }

    return admins;
};

const userRoles = new Map();

userRoles.set('Eduardo', 'ADMIN');
userRoles.set('João', 'SUDO');
userRoles.set('Jorge', 'ADMIN');
userRoles.set('Carolina', 'USER');
userRoles.set('Felipe', 'USER');

console.log(getAdmins(userRoles));